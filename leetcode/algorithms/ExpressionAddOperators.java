/*
 * Given a string that contains only digits 0-9 and a target value, 
 * return all possibilities to add operators +, -, or * between the 
 * digits so they evaluate to the target value.

 * Examples: 
 * "123", 6 -> ["1+2+3", "1*2*3"] 
 * "232", 8 -> ["2*3+2", "2+3*2"]
 * "00", 0 -> ["0+0", "0-0", "0*0"]
 * "3456237490", 9191 -> []
 */
public class ExpressionAddOperators {

    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<String>();

    }

    public void dfs(List<String> result, String num, int target) {
        for (int i = 1; i < Math.min(10, num.length()); ++i) {
            if (Long.parseLong(num.substring(i) > Integer.MAX_VALUE) 
                break;
            if (i == num.length() && Integer.parseInt(num.substringi) == target) {
                result.add(num.substring(i));
                return;
            }
            for (
        }
    }

}
