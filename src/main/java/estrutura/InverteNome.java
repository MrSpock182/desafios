package estrutura;

public class InverteNome {

	/** COMPLEXIBILIDADE N **/
	public String inverte(String nome) {
		char[] value = nome.toCharArray();

		int start = 0;
		int last = value.length - 1;

		while (start < last) {
			char a = value[start];
			char b = value[last];

			value[start] = b;
			value[last] = a;

			start = start + 1;
			last = last - 1;
		}

		return new String(value);
	}

	/** COMPLEXIBILIDADE N **/
	public Boolean isPalindrome(String nome) {
		nome = nome.replace(" ", "");

		int start = 0;
		int last = nome.length() - 1;

		while (start < last) {
			if(nome.charAt(last) != nome.charAt(start)) {
				return false;
			}

			start = start + 1;
			last = last - 1;
		}

		return true;
	}

}
