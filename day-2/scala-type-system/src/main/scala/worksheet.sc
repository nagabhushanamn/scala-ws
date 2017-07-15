object worksheet {

  println("scala - learn ")                       //> scala - learn 
  
  
  class ClassName
  trait TraitName
  object ObjectName
  
  def foo(x:ClassName)=x;                         //> foo: (x: worksheet.ClassName)worksheet.ClassName
  def bar(x:TraitName)=x;                         //> bar: (x: worksheet.TraitName)worksheet.TraitName
  def baz(x:ObjectName.type)=x;                   //> baz: (x: worksheet.ObjectName.type)worksheet.ObjectName.type
  
  
  //foo(new ClassName)
  //bar(new TraitName{});
  //baz(ObjectName)
  
  

}