import java.util.*;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String fileName, String caption)
    {
        this.filename = filename;
        this.caption = caption;
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like()
    {
        likes++;
    }

    public void unLike()
    {
        if(likes <= 0){
            likes = 0;
        }
        else{
            likes--;
        }
    }

    public void addComment(String text)
    {
        comments.add(text);
    }

    public String getImageFile()
    {
        String imageFile = filename;
        return imageFile;
    }

    public String getCaption()
    {
        return caption;
    }

    public long getTimeStamp()
    {
        return timestamp;
    }

    public void display()
    {
        System.out.println("Username: " + username);
        System.out.println("Photo: " + filename);
        System.out.println("Caption: " + caption);
        System.out.println("Submitted: " + timeString(System.currentTimeMillis()));
        System.out.println("Likes: " + likes);
        if(comments.size() <= 0){
            System.out.println("No comments");
        }
        else{
            System.out.println("Comments: ");
            int count = 1;
            for(String comment: comments){
                System.out.println(count + ": " + comment);
                count++;
            }
        }
    }

    public String timeString(long time)
    {
        long tiempo = (time - timestamp)/1000;
        long minutes = (tiempo /60);
        long seconds = tiempo - (minutes * 60);        
        String timeString = minutes + " Mins " + seconds + " Secs.";
        return timeString;
    }
}