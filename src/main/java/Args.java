public class Args {
    private String schema;
    private String[] args;


    public Args(String schema,String[] args) {
        this.schema = schema;
        this.args = args;
    }

    public boolean getBoolean(String input){
      /* String[] Values = schema.split(",");
        for (String value: Values) {
            System.out.println(value);
            System.out.println(input);
            if(value.equals(input)){
                return true;
            }
        }*/
       /* Integer value = schema.indexOf("-"+input);
        schema[value];*/

        return schema.contains(input);


    }


    public Integer getNumber(String input){

        Integer start = schema.indexOf(input);
        Integer end = schema.indexOf(",",start);
        String result = schema.substring(start,end);
        System.out.println(result);
        if(!result.contains("#"))
            throw new IllegalArgumentException("ça doit être un chiffre");

        for (String arg: args) {
            if(arg.contains("-"+input))
            return Integer.valueOf(arg.substring(2).trim());
        }
         return 0;

    }

    public String getString(String input){

        Integer start = schema.indexOf(input);
        String result = schema.substring(start);
        System.out.println(result);
        if(!result.contains("*"))
            throw new IllegalArgumentException("ça doit être une string");

        for (String arg: args) {
            if(arg.contains("-"+input))
                return arg.substring(2).trim();
        }
        return "default";

    }
}