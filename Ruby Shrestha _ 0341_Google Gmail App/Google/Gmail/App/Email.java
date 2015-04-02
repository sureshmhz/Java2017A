package Google.Gmail.App;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Ruby Shrestha on 4/2/2015.
 * Roll Number : 0341
 * Section: A Batch 2017
 */

public class Email {
    private String from;
    private String to;
    private String cc;
    private String bcc;
    private String subject;
    private String body;
    private Date date;
    private String mailingList;
    public  enum Category{Inbox, Sent, Starred, Draft, Important};
    public Category emailCategory;

    Email(String from, String to, String cc, String bcc, String subject, String body, Date date, Category emailCategory, String mailingList ){
        this.from=from;
        this.to=to;
        this.cc=cc;
        this.bcc=bcc;
        this.subject=subject;
        this.body=body;
        this.date=date;
        this.mailingList=mailingList;
        this.emailCategory=emailCategory;
    }

    public Date getDate() {
        return date;
    }

    public String getMailingList() {
        return mailingList;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getBcc() {
        return bcc;
    }

    public String getCc() {
        return cc;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }
}
