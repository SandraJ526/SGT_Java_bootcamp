package learn.programming;

public class Note {

    private String note;
    private String to;
    private String recipient;
    private String from;
    private String sender;
    private String heading;
    private String headingName;
    private String noteBody;
    private String bodyMessage;

    public Note(String note, String to, String recipient, String from, String sender,
                String heading, String headingName, String noteBody, String bodyMessage) {
        this.note = note;
        this.to = to;
        this.recipient = recipient;
        this.from = from;
        this.sender = sender;
        this.heading = heading;
        this.headingName = headingName;
        this.noteBody = noteBody;
        this.bodyMessage = bodyMessage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getHeadingName() {
        return headingName;
    }

    public void setHeadingName(String headingName) {
        this.headingName = headingName;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    public String getBodyMessage() {
        return bodyMessage;
    }

    public void setBodyMessage(String bodyMessage) {
        this.bodyMessage = bodyMessage;
    }
}
