  public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
		stack.add(0);
		for (int i = 0; i < tokens.length; i++) {
			int temp = 0;
			if (tokens[i].equals("+")) {
				temp = stack.pop();
				stack.add(stack.pop() + temp);
			} else if (tokens[i].equals("-")) {
				temp = stack.pop();
				stack.add(stack.pop() - temp);

			} else if (tokens[i].equals("*")) {
				temp = stack.pop();
				stack.add(stack.pop() * temp);

			} else if (tokens[i].equals("/")) {
				temp = stack.pop();
				int div = stack.pop() / temp;
				
				stack.add(div);
			}
			else {
				stack.add(Integer.parseInt(tokens[i]));
			}
		}

		return stack.peek();
    }
