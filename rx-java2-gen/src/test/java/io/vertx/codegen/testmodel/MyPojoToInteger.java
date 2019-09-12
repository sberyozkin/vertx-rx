package io.vertx.codegen.testmodel;

import io.vertx.core.spi.json.JsonMapper;

import java.util.Objects;

public class MyPojoToInteger {

  int a;

  public static class MyPojoToIntegerMapper implements JsonMapper<MyPojoToInteger, Number> {

    public static final MyPojoToIntegerMapper INSTANCE = new MyPojoToIntegerMapper();

    @Override
    public MyPojoToInteger deserialize(Number value) throws IllegalArgumentException {
      return new MyPojoToInteger(value.intValue());
    }

    @Override
    public Number serialize(MyPojoToInteger value) throws IllegalArgumentException {
      return value.getA();
    }

    @Override
    public Class<MyPojoToInteger> getTargetClass() {
      return MyPojoToInteger.class;
    }
  }

  public MyPojoToInteger() {
  }

  public MyPojoToInteger(int a) {
    this.a = a;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyPojoToInteger that = (MyPojoToInteger) o;
    return a == that.a;
  }

  @Override
  public int hashCode() {
    return Objects.hash(a);
  }
}