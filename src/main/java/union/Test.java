package union;

import java.util.List;

public class Test {
	private String cnpj;
	private List<String> list;

	public Test(String cnpj) {
		this.cnpj = cnpj;
	}

	public Test(String cnpj, List<String> list) {
		this.cnpj = cnpj;
		this.list = list;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getCnpj() {
		return cnpj;
	}

	public List<String> getList() {
		return list;
	}

	@Override public String toString() {
		return "Test{" + "cnpj='" + cnpj + '\'' + ", list=" + list + '}';
	}
}
