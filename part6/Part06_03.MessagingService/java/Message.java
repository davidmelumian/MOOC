


public class Message {
    private String sender;
    private String content;
    public Message (String sender,String content){
        this.sender=sender;
        this.content=content;
    }
    public String getSender(){
        return this.sender;
    }
    public String getContent(){
        return this.content;
    }
    public boolean size(){
        if (this.content.length()<=280){
            return true;
        }
        return false;
    }
    public String toString(){
        return  "Sender: " + this.sender + " message: " + this.content;
    }
}
