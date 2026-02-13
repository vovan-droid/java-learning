package org.vova.dmdev.level2.block15;

public class Task3 {
    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p>asdf hjfjhsfa </p> <b> asff </b> efagadfadgsfag afaf <p id=\"p1\">gda dsgsg</p>" + "fafs <p>faas daf <p id=\"p2\">asdf</p>asfsa";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
