package by.htp.jd01.unit6.entity;

public class User {
    int idUser;
    private String nickName;
    private String hashPassword;

    public User() {
    }

    public User(String nickName, String hashPassword) {
        this.nickName = nickName;
        this.hashPassword = hashPassword;
    }

    public User(int idUser, String nickName, String hashPassword) {
        this.idUser = idUser;
        this.nickName = nickName;
        this.hashPassword = hashPassword;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hashPassword == null) ? 0 : hashPassword.hashCode());
        result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (hashPassword == null) {
            if (other.hashPassword != null)
                return false;
        } else if (!hashPassword.equals(other.hashPassword))
            return false;
        if (nickName == null) {
            if (other.nickName != null)
                return false;
        } else if (!nickName.equals(other.nickName))
            return false;
        return true;
    }


}
