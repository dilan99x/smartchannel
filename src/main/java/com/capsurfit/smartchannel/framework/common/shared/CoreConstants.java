package com.capsurfit.smartchannel.framework.common.shared;

public final class CoreConstants {
	public static final String BROWSER_TIMEZONE_ID = "browserTimeZoneId";
	public static final String BROWSER_TIME_ZONE = "BROWSER_TIME_ZONE";
	public static final String BROWSER_TYPE = "BROWSER_TYPE";
	public static final String BROWSER_SCREEN_RESOLUTION = "BROWSER_SCREEN_RESOLUTION";
	public static final String BROWSER_PLATFORM = "BROWSER_PLATFORM";
	public static final String BROWSER_DATE_TIME = "browserDateTime";

	public static final String STANDARD_DATE_PATTERN = "MM/dd/yyyy";
	public static final String STANDARD_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm";
	public static final String DATE_TIME_PATTERN_WITH_T = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String US_SHORT_DATE_TIME_PATTERN = "MM/dd/yyyy HH:mm";
	public static final String DATE_PATTERN_WITH_MONTH = "dd-MMM-yyyy";
	public static final String DATE_PATTERN ="dd/MM/yyyy HH:mm:ss";
	
	public static enum Symbol {
		EMPTY_STRING(""),
		
        // single character symbols, in alphabetical order
        AMPERSAND("&"),
        ASTERISK("*"),
        CLOSE_BRACE("}"),
        CLOSE_BRACKET("]"),
        CLOSE_PARENTHESIS(")"),
        COLON(":"),
        COMMA(","),
        EQUAL("="),
        FORWARD_SLASH("/"),
        OPEN_BRACE("{"),
        OPEN_BRACKET("["),
        OPEN_PARENTHESIS("("),
        PERCENTAGE("%"),
        QUESTION_MARK("?"),
        SEMICOLON(";"),
        SPACE(" "),
        TAB("\t"),
        UNDERSCORE("_"),
        
        // two character symbols, in alphabetical order
        COLON_SPACE(": "),
        COMMA_OPEN_BRACKET(",["),
        COMMA_SPACE(", "),
        DOUBLE_COLON("::"),
        DOUBLE_SPACE("  "),
        OPEN_BRACKET_SPACE("[ "),
        OPEN_CLOSE_PARENTHESIS("()"),
        SEMICOLON_SPACE("; "),
        SPACE_CLOSE_BRACKET(" ]"),
        SPACE_OPEN_BRACE(" {"),
        DOT("\\."),
        
        // letters, in alphabetical order
        B("B"),
        D("D"),
        E("E"),
        L("L"),
        M("M"),
        N("N"),
        S("S"),
        X("X"),
        Y("Y"),
        
        //Gender
        MALE("Male"),
        FEMALE("Female"),
        
        // others, in alphabetical order
        AMPERSAND_CODE("%26"),
        AMPERSAND_ESCAPE("!!_amp_!!"),
        CR_LF("\r\n"),
        DOUBLE_QUOTE("\""),
        HTML_BR("<br/>"),
        HTML_NBSP("&nbsp;"),
        HTML_NBSP_2("&nbsp;&nbsp;"),
        NEW_LINE("\n"),
        NULL_STRING("<null>"),
        SPACE_PADDED_DOUBLE_COLON(" :: "),
        SPACE_PADDED_DOUBLE_GT(" >> "),
        SPACE_PADDED_EQUAL(" = "),
        SPACE_PADDED_FORWARD_SLASH(" / "),
        SPACE_PADDED_OPEN_BRACKET(" [ "),
        AM("AM"),
        PM("PM");
	
        private String symbol;

        private Symbol(String symbol) {
            this.symbol = symbol;
        }

        public String getValue() {
            return symbol;
        }
	}
}
