object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(47); 

  println("scala - learn ")
  
  
  class ClassName
  trait TraitName
  object ObjectName;$skip(91); 
  
  def foo(x:ClassName)=x;System.out.println("""foo: (x: worksheet.ClassName)worksheet.ClassName""");$skip(26); ;
  def bar(x:TraitName)=x;System.out.println("""bar: (x: worksheet.TraitName)worksheet.TraitName""");$skip(32); ;
  def baz(x:ObjectName.type)=x;;System.out.println("""baz: (x: worksheet.ObjectName.type)worksheet.ObjectName.type""")}
  
  
  //foo(new ClassName)
  //bar(new TraitName{});
  //baz(ObjectName)
  
  

}
