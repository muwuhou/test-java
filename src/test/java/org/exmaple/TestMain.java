package org.exmaple;

import com.google.common.collect.ImmutableList;
import org.junit.Test;


public class TestMain {

  @Test
  public void test1() {
    var x = "Hello world";
    var y = ImmutableList.of("hello", "world");
    System.out.println(x);
    System.out.println(y);
  }
}
