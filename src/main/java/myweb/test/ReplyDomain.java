package myweb.test;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="user")
public class ReplyDomain implements Serializable {
    
    private static final long serialVersionUID = -4939831239543440717L;

    @Id
    private String id;
    private int bno;
    private int rno;
    private String contents;
    private String userName;

    /**
     * @return the bno
     */
    public int getBno() {
        return bno;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the contents
     */
    public String getContents() {
        return contents;
    }

    /**
     * @param contents the contents to set
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * @return the rno
     */
    public int getRno() {
        return rno;
    }

    /**
     * @param rno the rno to set
     */
    public void setRno(int rno) {
        this.rno = rno;
    }

    /**
     * @param bno the bno to set
     */
    public void setBno(int bno) {
        this.bno = bno;
    }
}