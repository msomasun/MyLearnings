package test.com.howtodoinjava.demo;

import com.howtodoinjava.demo.collection.MyListStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

public class MyListStackTest {

    static MyListStack testObj ;

    @Before
    public void setUp(){
        this.testObj = new MyListStack();
    }

    @Test
    public void givenEmptyStack_whenCheckSize_ThenSizeIsZero() {
        assertEquals(0,this.testObj.getSize());
    }

    @Test
    public void givenEmptyStack_when2ElementsPushed_ThenSizeIs2(){
        this.testObj.push(11);
        this.testObj.push(12);
       assertEquals(2,this.testObj.getSize());

    }

    @Test
    public void givenEmptyStack_whenPush2_ThenPeekReturnsTop_RetainsSize() {
        testObj.push(11);
        testObj.push(12);
        assertEquals(12, this.testObj.peek());
        assertEquals(2,this.testObj.getSize());
    }

    @Test(expected= EmptyStackException.class)
    public void givenEmptyStack_whenPop_ThenReturnsError(){
        testObj.pop();
    }

    @Test
    public void givenEmptyStack_whenPush2_ThenPopReturnsTop_ReducedSizeBy1(){
        testObj.push(11);
        testObj.push(12);
        assertEquals(12,testObj.pop());
        assertEquals(1,testObj.getSize());
        assertEquals(11,testObj.pop());

        Assert.assertEquals(0,testObj.getSize());
    }

    @Test(expected = StackOverflowError.class)
    public void givenFulltack_whenPush_ThenReturnsError(){
        testObj.push(11);
        testObj.push(12);
        testObj.push(11);
/*        testObj.push(11);
        testObj.push(11);
        testObj.push(11);
        testObj.push(11);
        testObj.push(11);
        testObj.push(11);
        testObj.push(11);

        testObj.push(11);*/
    }

}
