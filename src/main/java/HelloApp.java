public class HelloApp{
public static void main(String[] args){
String name="World";
if(args.length>0){
StringBuilder NameBuilder=new StringBuilder();
for(int i=0;i<args.length;i++){
NameBuilder.append(args[i]);
if(i<args.length-1) NameBuilder.append(", ");
}
name=NameBuilder.toString();
}
System.out.println("Hello, "+name+"!");
}
}
