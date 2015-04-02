/**
 * Created by Shreha on 4/2/2015.
 */
public class Instagram {
    public static void main(String[] args)
    {
        InstaLogin login = new InstaLogin();
        login.signUp();
        login.signIn();
        login.username = usernae;
        login.password = password;
        login.signOut();

        InstaProfile profile = new InstaProfile();
        profile.makeProfile();
        profile.followPeople();
        profile.followPeopleBack();

        InstaUpload upload = new InstaUpload();
        upload.uploadPhotos();
        upload.uploadVideos();

        InstaComment comment = new InstaComment();
        comment.commentPhotos();
        comment.commentVideos();
        comment.directMessage();

        InstaShare share = new InstaShare();
        share.shareonFacebook();
        share.shareonTwitter();
        share.shareonFlickr();
        share.shareonTumbler();
    }
}

class InstaLogin{
    String username, password;

    signUp(){}; //creating a new account
    signIn(){}; //verifying username and password
    signOut(){}; //closing the account temporarily
}

class InstaProfile{

    makeProfile(){}; //show everyone you profile, interests, present oneselg
    followPeoples(){}; //following peoples, friends
    followPeopleBack(){}; //follow back to those peoples who have followed you
}

class InstaUpload{
    uploadPhotos(){}; //upload photos in instagram
    uploadVideos(){}; //upload videos in the instagram
}

class InstaComment{
    commentPhotos(){}; // comment on the photos
    commentVideos(){}; //comment on the videos
    directMessage(){}; //send direct message to friends or followers
}

class InstaShare{
    shareonFacebook(){}; //share the uploaded photos or videos in Facebook
    shareonTwitter(){}; //share the uploaded photos or videos in Twitter
    shareonTumbler(){}; //share the uploaded photos or videos in Tumbler
    shareonFlickr(){}; //share the uploaded photos or videos in Flickr
}
