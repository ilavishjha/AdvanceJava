package in.co.rays.practice;

public class TestMarksheet1 {
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception {
		Marksheet1Bean bean = new Marksheet1Bean();
bean.setS_no(17);
			bean.setName("Arun");
		bean.setRoll_no(200);
		bean.setPhysics(34);
		bean.setChemistry(87);
		bean.setMaths(57);

		Marksheet1Model model = new Marksheet1Model();
		model.add(bean);
	}
}
