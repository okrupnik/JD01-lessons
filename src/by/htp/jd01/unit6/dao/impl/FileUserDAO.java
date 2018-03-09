package by.htp.jd01.unit6.dao.impl;

import by.htp.jd01.unit6.dao.UserDAO;
import by.htp.jd01.unit6.dao.exception.DAOException;
import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.entity.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.security.NoSuchAlgorithmException;

public class FileUserDAO implements UserDAO {
    private static final Logger log = LogManager.getLogger(FileUserDAO.class.getName());

    @Override
    public boolean logination(User user) throws DAOException {
        FileInputStream userReader = null;
        try {
            userReader = new FileInputStream("src/by/htp/jd01/unit6/users/" + DataSourseProperty.USER_DATA_FILE);
            byte[] contentFile = new byte[userReader.available()];
            userReader.read(contentFile);
            String[] lines = new String(contentFile).split("\n");
            for (String line : lines) {
                String[] words = line.split(" ");
                if (user.getNickName().toLowerCase().equals(words[0].toLowerCase())) {
                    if (EncryptPassword.byteArrayToHexString(EncryptPassword.computeHash(user.getHashPassword())).equals(words[1])) {
                        return true;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new DAOException("Can't find file", e);
        } catch (IOException e) {
            throw new DAOException("Can't read file", e);
        } catch (NoSuchAlgorithmException e) {
            throw new DAOException("Can't find encrypt algoritm", e);
        } finally {
            if (userReader != null) {
                try {
                    userReader.close();
                } catch (IOException e) {
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        log.error(stackTraceElement);
                    }
                }
            }
        }

        return false;
    }

    @Override
    public void edit(UserInfo user) throws DAOException {


    }

}
