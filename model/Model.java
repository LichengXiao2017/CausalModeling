package model;

public class Model {
	public Model(){
		
	}
	// if v == true: the article contains vital information;
	// if v == false: the article doesn't contains vital information;
	// if s == true: the article was posted in social media;
	// if s == false: the article wasn't posted in social media;
	// if w == true: the user was wavering among articles;
	// if w == false: the user wasn't wavering among articles;
	// if h == true: the article was sent to hostile nations;
	// if h == false: the article wasn't sent to hostile nations;
	// if policy[0] == true: Continue access;
	// if policy[0] == false: Deny access;
	// if policy[1] == true: Notify homeland security;
	// if policy[1] == false: Don't notify homeland security(print nothing);
	public boolean[] getPolicy(boolean v, boolean s, boolean w, boolean h) {
		// instantiate a new boolean array of two boolean values;
		boolean[] policy = new boolean[2];
		// if the article was sent to a hostile nation, then we should deny access to the user
		// who did this act, and notify the homeland security, no matter whether the article contains
		// vital information, or was posted on social media, or the user was wavering among articles.
		if (h == true) {
			policy[0] = false;
			policy[1] = true;
		// if the article was not sent to any hostile nation, and it doesn't contain vital information,
		// then we should just allow the user to continue access.
		} else if (v == false) {
			policy[0] = true;
			policy[1] = false;
		// if the article was not sent to any hostile nation, but it contains vital information,
		// and it was posted on some social media, then we should deny the user's access.
		} else if (s == true) {
			policy[0] = false;
			policy[1] = false;
		// if the article was not sent to any hostile nation, and it contains vital information,
		// and it wasn't posted on some social media, but the user was wavering among articles,
		// then we should deny the user's access.
		} else if (w == true){
			policy[0] = false;
			policy[1] = false;
		// if the article was not sent to any hostile nation, and it contains vital information,
		// and it wasn't posted on some social media, and the user wasn't wavering among articles,
		// then we should just allow the user to continue access.
		} else {
			policy[0] = true;
			policy[1] = false;
		}
		// return the policy as boolean array.
		return policy;
	}
	
	// translate boolean[] policy to readable strings;
	public String translatePolicy(boolean[] policy) {
		// instantiate a new String to store the result which is going to print.
		String result = "";
		// if we allow the user to continue access, then we add "Continue access." to the result,
		// else we add "Deny access" to the result.
		if (policy[0] == true) {
			result += "Continue access.";
		} else {
			result += "Deny access.";
		}
		
		// if we are going to notify the homeland security, then we add " Notify the Homeland Security." to the result,
		// else we add nothing to the result.
		if (policy[1] == true) {
			result += " Notify the Homeland Security.";
		}
		// print the result to the console, and return the result.
		System.out.println(result);
		return result;
	}
}
