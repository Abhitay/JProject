package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


class test
{
    node head;
}

class node extends test
{
    String ID1;
    String pass1;
    String name1;
    String number1;
    node next;
    node prev;

    public node ()
    {
        head=null;
    }
    public node(String ID2,String pass2,String name2,String number2)
    {
        ID1=ID2;
        pass1=pass2;
        name1=name2;
        number1=number2;
    }
    void insert_beg (String ID3, String pass3,String name3,String number3)
    {
        node first = new node(ID3,pass3,name3,number3);
        first.prev= null;
        if(head==null)
        {
            first.next = null;
        }
        else
        {
            first.next = head;
        }
        head=first;
    }
    void insert_end (String ID3, String pass3,String name3,String number3)
    {
        if(head==null)
        {
            insert_beg(ID3, pass3,name3,number3);
    }
        else
        {
            node last = new node(ID3,pass3,name3,number3);
            node cur=head;
            while(cur.next!=null)
            {
                cur=cur.next;
            }
            cur.next=last;
            last.next=null;
            last.prev=cur;
        }
    }
    void delete_mid(String ID3) {
        node cur = head;
        if (cur == null) {

        } else {
            while ((cur.ID1).compareTo(ID3) != 0) {
                cur = cur.next;
            }
            if (cur == head) {
                head = head.next;
            }
            if (cur.prev != null) {
                (cur.next).prev = (cur.prev);
            }
            if (cur.next != null) {
                (cur.prev).next = cur.next;
            }
        }
    }
    String search(String ID4)
    {
        int d=0;
        String pass4="Wrongpassword";
        node cur = head;
        while(cur!=null)
        {
            if((cur.ID1).compareTo(ID4) == 0)
            {
                pass4= cur.pass1;
                d++;
            }
            cur=cur.next;
        }
        if(d==0)
        {
            System.out.println("The account does not exist!");
        }
        return pass4;
    }
}
public class Main extends Application
{
        int i =0;
        @FXML
        TextField Loginemailid;
        @FXML
        PasswordField LoginPassword;
        @FXML
        Button Loginbutton;
        @FXML
        Button Adminbutton;
        @FXML
        Label l1;
        @FXML
        TextField SignupEmailID;
        @FXML
        PasswordField Signuppassword;
        @FXML
        TextField Signupname;
        @FXML
        TextField Signupnumber;
        @FXML
        Button Confirmsignupbutton;
        @FXML
        Button Backbutton;
        @FXML
        PasswordField Signupconfirmpassword;
        @FXML
        Button deativate;
        //home
        @FXML
        Label Homename;
        @FXML
        Label Homeemail;
        @FXML
        Label Homenumber;
        @FXML
        Label Homemember;
        @FXML
        Button homesearch;
        @FXML
        Button homecategories;
        @FXML
        Label label1;
        @FXML
        Button homecart;
        @FXML
        Button homemembership;
        @FXML
        Button homefeedback;
        @FXML
        Button homehistory;
        //search
        @FXML
        Button Searchprofile;
        @FXML
        Button Searchcategories;
        @FXML
        Button Searchcart;
        @FXML
        Button Searchmembership;
        @FXML
        Button Searchfeedback;
        @FXML
        Button Searchhistory;
        //Category
        @FXML
        Button Categoryprofile;
        @FXML
        Button Categorysearch;
        @FXML
        Button Categorycart;
        @FXML
        Button Categorymembership;
        @FXML
        Button Categoryfeedback;
        @FXML
        Button Categoryhistory;
        //cart
        @FXML
        Button Cartprofile;
        @FXML
        Button Cartsearch;
        @FXML
        Button Cartcategories;
        @FXML
        Button Cartmembership;
        @FXML
        Button Cartfeedback;
        @FXML
        Button Carthistory;
        //Member
        @FXML
        Button Memberprofile;
        @FXML
        Button Membersearch;
        @FXML
        Button Membercategories;
        @FXML
        Button Membercart;
        @FXML
        Button Memberfeedback;
        @FXML
        Button Memberhistory;
        //feedback
        @FXML
        Button feedbackprofile;
        @FXML
        Button feedbacksearch;
        @FXML
        Button feedbackcategories;
        @FXML
        Button feedbackcart;
        @FXML
        Button feedbackmembership;
        @FXML
        Button feedbackhistory;
        //history
        @FXML
        Button Historyprofile;
        @FXML
        Button Historysearch;
        @FXML
        Button Historycategories;
        @FXML
        Button Historycart;
        @FXML
        Button Historymembership;
        @FXML
        Button Historyfeedback;

    node obj = new node();

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Fusion Gaming &Co");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
    int j = 0;
    @FXML
    public void Admin (ActionEvent event) throws IOException
    {
        //for testing
        l1.setText(""+i);
        i++;
    }
    @FXML
    //done
    void goeshome(ActionEvent event) throws IOException
    {
        String id = Loginemailid.getText();
        //obj.display();
        String check = obj.search(id);
        if(check.equals("Wrongpassword")==true)
        {
            Parent view2 = FXMLLoader.load(getClass().getResource("Error.fxml"));
            Scene scene2 = new Scene(view2);
            Stage window = new Stage();
            window.setScene(scene2);
            window.show();
        }
        else
            {
               if(LoginPassword.equals(check)==true)
               {
                   Parent view2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
                   Scene scene2 = new Scene(view2);
                   Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                   window.setScene(scene2);
                   window.show();
               }

            }
    }
    @FXML
    //done
    void goeshomeSignup(ActionEvent event) throws IOException
    {
        int k =0;
        j=10;
        String id1 = SignupEmailID.getText();
        String pass = Signuppassword.getText();
        String repass = Signupconfirmpassword.getText();
        String number = Signupnumber.getText();
        String name = Signupname.getText();
        if(id1.contains("@") && (id1.contains(".com") == true || id1.contains(".in") == true|| id1.contains(".co") == true))
        {
            if(pass.equals(repass)==true && pass.length()>7 && (pass.contains("1") == true || pass.contains("2") == true ||
                    pass.contains("3") == true || pass.contains("4") == true ||  pass.contains("5") == true || pass.contains("6") == true ||
                    pass.contains("7") == true || pass.contains("8") == true || pass.contains("9") == true || pass.contains("0")== true ) &&
                    (pass.contains("!") == true|| pass.contains("@")== true || pass.contains("#") == true|| pass.contains("?") == true ) &&
                    pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*"))
            {
                if(number.length()==10)
                {
                    for(int i=0;i<10;i++)
                    {
                        char c;
                        c=number.charAt(i);
                        if( c=='1' || c=='2' || c=='3'|| c=='4' || c=='5' || c=='6'|| c=='7' || c=='8' || c=='9' || c=='0')
                        {
                           k=10;

                        }
                        else
                        {

                            Parent view2 = FXMLLoader.load(getClass().getResource("ErrorSignup.fxml"));
                            Scene scene2 = new Scene(view2);
                            Stage window = new Stage();
                            window.setScene(scene2);
                            window.show();

                        }
                    }


                    }
                else
                {
                    Parent view2 = FXMLLoader.load(getClass().getResource("ErrorSignup.fxml"));
                    Scene scene2 = new Scene(view2);
                    Stage window = new Stage();
                    window.setScene(scene2);
                    window.show();
                }
            }
            else
            {
                Parent view2 = FXMLLoader.load(getClass().getResource("ErrorSignup.fxml"));
                Scene scene2 = new Scene(view2);
                Stage window = new Stage();
                window.setScene(scene2);
                window.show();
            }

        }
        else
        {
            Parent view2 = FXMLLoader.load(getClass().getResource("ErrorSignup.fxml"));
            Scene scene2 = new Scene(view2);
            Stage window = new Stage();
            window.setScene(scene2);
            window.show();
        }
        if(k==10)
        {
            obj.insert_end(id1, pass,name,number);
            Parent view2 = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene scene2 = new  Scene(view2);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();
        }
    }
    @FXML
    //done
    void goessignup(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
    //done
    void Goeslogin(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
        //done
    void goprofile(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
        //done
    void gosearch(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("Search.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
        //done
    void gocategory(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("Category.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
        //done
    void gocart(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
        //done
    void gomember(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("Member.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
        //done
    void gofeedback(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("Feedback.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
        //done
    void gohistory(ActionEvent event) throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("History.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    @FXML
    void deactivatedata(ActionEvent event ) throws IOException
    {
        String id = Homeemail.getText();
        obj.delete_mid(id);
        Parent view2 = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene2 = new  Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
}
