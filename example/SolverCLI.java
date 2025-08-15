import cs.min2phase.Search;

public class SolverCLI {
    public static void main(String[] args) {
        // Check if a facelet string was provided as an argument
        if (args.length < 1) {
            System.err.println("Error: Please provide a facelet string as the first argument.");
            System.err.println("Usage: java SolverCLI <facelet_string>");
            System.exit(1);
        }
        
        String facelet = args[0];
        
        // Initialize the solver
        Search.init();
        
        // Create a new search object and solve the cube
        Search searchObj = new Search();
        String result = searchObj.solution(facelet, 21, 100000000, 0, 0);
        
        // Print the result to the console
        System.out.println(result);
    }
}