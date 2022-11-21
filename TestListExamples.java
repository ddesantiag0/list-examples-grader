import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void filterTest(){
    StringChecker sc = new StringChecker() {

      public boolean checkString(String s){
          return s.length() < 8;
      }
  };


  
  ArrayList<String> list = new ArrayList<>();
  list.add("Banjo");
  list.add("Patel");
  list.add("Jareky");

  List<String> newList = ListExamples.filter(list, sc);

  ArrayList<String> expected = new ArrayList<>();
  expected.add("Banjo");
  expected.add("Patel}");


  assertArrayEquals(expected.toArray(), newList.toArray());
  }

  @Test
  public void mergeTest(){
    List<String> list1 = new ArrayList<>();

    list1.add("Jareky");
    list1.add("Banjo}");

    List<String> list2 = new ArrayList<>();
    list2.add("Patel");

    List<String> newList = ListExamples.merge(list1, list2);
    List<String> expected = new ArrayList<>();
    expected.add("Jareky");
    expected.add("Banjo");
    expected.add("Patel");

    assertArrayEquals(expected.toArray(), newList.toArray());
  }
}
