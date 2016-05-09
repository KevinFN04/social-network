import java.util.*;
/**
 * Write a description of class MassagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        username = author;
        message = text;
        timestamp = 0;
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like()
    {

    }

    public void unLike()
    {

    }

    public void addComment(String text)
    {

    }

    public String getText()
    {
        return message;
    }

    public long getTimeStamp()
    {
        return timestamp;
    }

    public void display()
    {

    }

    public String timeString(long time)
    {
        String timeString = "";
        return timeString;
    }
}
