public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        String[] array = {"qwerty", "qww", "qwerty qwerty", "90"};

        // Here can test
    }

    public String shortestString(String[] array) {
        String result = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i].length() < result.length()) {
                result = array[i];
            }
        }
        return result;
    }

    public String longestString(String[] array) {
        String result = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i].length() > result.length()) {
                result = array[i];
            }
        }
        return result;
    }

    public String longerThanAverageLength(String[] array) {
        int summaOfLengths = 0;
        StringBuilder result = new StringBuilder();
        for (String s : array) {
            summaOfLengths += s.length();
        }
        summaOfLengths /= array.length;
        for (String s : array) {
            if (s.length() > summaOfLengths) {
                result.append(s).append(" ");
            }
        }
        return result.toString();
    }

    public String shorterThanAverageLength(String[] array) {
        int summaOfLengths = 0;
        StringBuilder result = new StringBuilder();
        for (String s : array) {
            summaOfLengths += s.length();
        }
        summaOfLengths /= array.length;
        for (String s : array) {
            if (s.length() < summaOfLengths) {
                result.append(s).append(" ");
            }
        }

        return result.toString();
    }

    public String theLessDifferentSymbols(String[] array) {
        int min = removeDuplicates(array[0]).length();
        int index = 0;
        for(int i = 1; i < array.length; i++) {
            if(min > removeDuplicates(array[i]).length()) {
                min = removeDuplicates(array[i]).length();
                index = i;
            }
        }

        return array[index];
    }

    public String allDifferentLetters(String[] array) {
        for(int i = 0; i < array.length; i++) {
            if(searchDuplicates(array[i])) {
                return array[i];
            }
        }
        return "All duplicates";
    }

    public String searchNumber(String[] array) {
        for(int i = 0; i < array.length; i++) {
            if(isDigit(array[i])) {
                return array[i];
            }
        }
        return "No numbers";
    }

    public String removeDuplicates(String input){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(!result.toString().contains(String.valueOf(input.charAt(i)))) {
                result.append(String.valueOf(input.charAt(i)));
            }
        }
        return result.toString();
    }
    public boolean searchDuplicates(String input){
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == (array[j])) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isDigit(String number) {
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) < '0' || number.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}

