import java.util.LinkedList;

class Main {
    
    Integer carry = 0;
    LinkedList<Integer> sumList = new LinkedList<Integer> ();

    LinkedList sumLists(LinkedList<Integer> operand1, LinkedList<Integer> operand2) {
        Integer sum = operand1.removeFirst() + operand2.removeFirst() + carry;
        Integer rem = sum % 10;
        carry = sum / 10;
        sumList.add(rem);
        if (operand1.size() != 0 && operand2.size() != 0) {
            return sumLists(operand1, operand2);
        }
        else if (operand1.size() == 0) {
            sum = operand2.getFirst() + carry;
            operand2.set(0, sum);
            sumList.addAll(operand2);
            return sumList;
        }
        else if (operand2.size() == 0) {
            sum = operand1.getFirst() + carry;
            operand1.set(0, sum);
            sumList.addAll(operand1);
            return sumList;
        }
        else {
            if (carry == 1) {
                sumList.add(carry);
                return sumList;
            }
            else {
                return sumList;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> number1 = new LinkedList<Integer> ();
        number1.add(7);
        number1.add(1);
        number1.add(6);
        LinkedList<Integer> number2 = new LinkedList<Integer> ();
        number2.add(5);
        number2.add(9);
        number2.add(7);
        
        Main newSum = new Main();
        LinkedList<Integer> sum = newSum.sumLists(number1, number2);
        System.out.println(sum);
    }
}