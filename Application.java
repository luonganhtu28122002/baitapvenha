package baitap;

import com.google.gson.Gson;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static baitap.Connection.getConnection;

public class Application {
    public static void main(String[] args) throws SQLException, IOException, ParserConfigurationException, TransformerException {
        loadData();
        writeJson();
        writeXml();
    }
    static List<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void addStudent(baitap.Student student){
        studentList.add(student);
    }
    public static void loadData() throws SQLException {
        Connection connection = getConnection();
        String query ="Select * from student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id =resultSet.getInt(1);
            String name = resultSet.getString(2);
            String address = resultSet.getString(3);
            String mobile = resultSet.getString(4);
            System.out.println(id + "|" +name +"|"+ address + "|" +mobile );
            baitap.Student student = new baitap.Student(id, name, address, mobile);
            addStudent(student);
        }

    }
    public static void writeJson() throws IOException {
        Writer writer =  new FileWriter("student.json");
        new Gson().toJson(studentList,writer);
        writer.close();
        System.out.println("complete");
    }
    public static void writeXml() throws ParserConfigurationException, TransformerException {
        DocumentBuilder builder = DocumentBuilderFactory.newNSInstance().newDocumentBuilder();
        Document dom = builder.newDocument();

        Element root = dom.createElement("user");
        dom.appendChild(root);

        for (Student student : studentList) {
            Element students = dom.createElement("student");
            root.appendChild(students);
            Attr attr = dom.createAttribute("id");
            attr.setValue("1");
            root.setAttributeNode(attr);

            Element name = dom.createElement("name");
            name.setTextContent("anktu");
            Element address = dom.createElement("address");
            address.setTextContent("hangchieu");
            Element mobile = dom.createElement("mobile");
            mobile.setTextContent("0911604868");

            root.appendChild(name);
            root.appendChild(address);
            root.appendChild(mobile);
        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT,"yes");
        transformer.transform(new DOMSource(dom),new StreamResult((new File("Students.xml"))));


    }
}
