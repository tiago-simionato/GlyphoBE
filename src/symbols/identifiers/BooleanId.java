package src.symbols.identifiers;

import src.symbols.DataType;

public class BooleanId extends AbstractIdentifier{
    private Boolean value;
  
  public BooleanId(String name) {
    super(name, DataType.BOOLEAN);
  }

  public BooleanId(String name, Boolean value) {
    super(name, DataType.BOOLEAN);
    this.value = value;
  }

  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Identifier [name=" + name + ", type=" + type + ", value=" + value + "]";
  }
}
