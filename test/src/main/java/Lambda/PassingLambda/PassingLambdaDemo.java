package Lambda.PassingLambda;

import java.util.*;
import java.util.Map;

@FunctionalInterface
interface Evaluator{
    public boolean evaluate(int score);
}

interface Examination{
    public void attendExam(Evaluator evaluator,String studentName, int score);
}

public class PassingLambdaDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScoreMap = new HashMap<>();
        studentScoreMap.put("arun",50);
        studentScoreMap.put("varun",25);
        studentScoreMap.put("tarun",46);
        studentScoreMap.put("lithun",34);

        Evaluator evaluator = (score)->{
            return score > 40 ? true : false;
        };


        Examination exam = (eval,sname,score)->{
            if(eval.evaluate(score))
            {
                System.out.println(sname +" passed in exam");
            }
            else{
                System.out.println(sname+" failed in exam");
            }
        };

        for(Map.Entry<String,Integer> entry : studentScoreMap.entrySet())
        {
            String name = entry.getKey();
            int score = entry.getValue();
            exam.attendExam(evaluator,name,score);
        }
    }
}
