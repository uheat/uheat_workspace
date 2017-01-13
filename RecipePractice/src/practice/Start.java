package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

	static final int user_num = 100;
	static final int max_recipe = 100;
	static int num_of_recipe = 0;

	static Scanner in = new Scanner(System.in);
	static UserInfo user_info[] = new UserInfo[user_num];
	static int num_of_user;
	Recipe recipe[] = new Recipe[max_recipe];

	public Start() {
		// TODO Auto-generated constructor stub
		num_of_user = 0;
		for (int i = 0; i < user_num; i++) {
			user_info[i] = new UserInfo();
		}

		for (int i = 0; i < max_recipe; i++) {
			recipe[i] = new Recipe();
		}

	}

	public void Main() {

		System.out.println("레시피파인더");
		System.out.println("*********");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 끝내기");
		System.out.println("*********");
		boolean flag = true;
		while (flag) {
			System.out.print("입력: ");
			try {
				int choice = in.nextInt();

				switch (choice) {
				case 1:
					Join();
					flag = false;
					break;
				case 2:
					Login();
					flag = false;
					break;
				case 3:
					Exit();
					flag = false;
					break;
				default:
					System.out.println("다시 입력해주세요.");
					flag = true;
					Main();
				}
			} catch (InputMismatchException e) {
				in.next();
				System.out.println("숫자만 입력가능합니다.");
			}
		}

	}

	public void Login() {

		System.out.print("아이디: ");
		String user_id = in.next();

		System.out.print("비밀번호: ");
		String user_password = in.next();

		for (int i = 0; i < num_of_user; i++) {
			if (user_info[i].getId().equals(user_id)) {
				if (user_info[i].getPassword().equals(user_password)) {
					System.out.println(user_info[i].getId() + " 님, 환영합니다.");
					System.out.println();
					choice();
					return;
				}
			}
		}

		System.out.println("해당하는 아이디나 패쓰워드가 존재하지 않습니다.");
		System.out.println();
		Main();

	}

	public void Join() {

		System.out.print("id 중복확인: ");

		String user_id = in.next();
		for (int i = 0; i < num_of_user; i++) {
			if (user_info[i].getId().equals(user_id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				Join();
			}
		}

		System.out.print("사용가능한 아이디입니다. 사용하시겠습니까?" + " 1. 예 / 2. 아니오 ");

		int input = in.nextInt();
		if (input == 1) {
			System.out.print("비밀번호를 입력해주세요: ");
			String user_password = in.next();
			user_info[num_of_user].setId(user_id);
			user_info[num_of_user].setPassword(user_password);
			num_of_user++;
			System.out.println("가입이 완료되었습니다.");
			System.out.println();
			Main();
		} else if (input == 2) {
			Join();
		} else {
			System.out.println("잘못입력하셨습니다.");
			Join();
		}

	}

	public void choice() {
		boolean flag = true;
		while (flag) {
			System.out.println("1. 레시피추가");
			System.out.println("2. 레시피검색");
			System.out.print("입력: ");
			try {
				int input = in.nextInt();
				if (input == 1) {
					addRecipe();
				} else if (input == 2) {
					Search();
				} else {
					System.out.println("잘못입력하셨습니다.");
					choice();
				}
			} catch (InputMismatchException e) {
				in.next();
				System.out.println("숫자만 입력가능합니다.");
			}
		}

	}

	public void addRecipe() {
		boolean flag = true;
		System.out.print("레시피 이름: ");
		String recipe_name = in.next();

		recipe[num_of_recipe].name = recipe_name;
		while (flag) {
			try {
				System.out.print("\t재료 개수: ");
				recipe[num_of_recipe].num_of_food = in.nextInt();
				flag = false;
			} catch (InputMismatchException e) {
				in.next();
				System.out.println("숫자만 입력가능합니다.");
			}
		}
		System.out.println("---- 재료 입력 ----");

		// recipe[num_of_recipe].num_of_food = num_of_kind;
		for (int i = 0; i < recipe[num_of_recipe].num_of_food; i++) {
			System.out.print((i + 1) + "번째 재료: ");
			recipe[num_of_recipe].food[i].name = in.next();
//			recipe[num_of_recipe].food[i].name = kind_of_food;
		}

		System.out.print("요리 방법: ");
		in.nextLine();
		String way = in.nextLine();
		recipe[num_of_recipe].way_to_cook = way;

		num_of_recipe++;
		System.out.println();

		choice();

	}

	public void Search() {
		System.out.println("재료를 검색하시고, 다 입력하셨으면 1을 입력하세요.");

		while (true) {
			String input = in.next();
			if (input.equals("1"))
				FindBetterRecipe();

			for (int i = 0; i < num_of_recipe; i++) {
				for (int j = 0; j < recipe[i].num_of_food; j++) {
					if (recipe[i].food[j].name.equals(input))
						recipe[i].equal_num_food++;
				}
			}

		}
	}

	public void FindBetterRecipe() {

		int tmp_num = recipe[0].equal_num_food;
		int max_number = 0;

		for (int i = 0; i < recipe.length; i++) {
			if (tmp_num < recipe[i].equal_num_food) {
				max_number = recipe[i].equal_num_food;
			}
		}

		int max_count = 0;
		for (int i = 0; i < recipe.length; i++) {
			if (max_number == recipe[i].equal_num_food) {
				max_count++;
			}
		}

		int max_idx[] = new int[max_count];

		for (int i = 0; i < recipe.length; i++) {
			if (max_number == recipe[i].equal_num_food) {
				max_idx[max_count - 1] = i;
			}
		}

		recommend(max_idx, max_count);
	}

	public void recommend(int max_idx[], int max_count) {

		for (int i = 0; i < max_count; i++) {
			int arr_idx = max_idx[i];
			System.out.println("레시피: " + recipe[arr_idx].name);
			System.out.print("종류: ");
			for (int j = 0; j < recipe[arr_idx].num_of_food; j++) {
				System.out.print(recipe[arr_idx].food[j].name);
				String tmp = (i == recipe[arr_idx].num_of_food - 1) ? " " : ", ";
				System.out.print(tmp);
			}
			System.out.println("방법: " + recipe[arr_idx].way_to_cook);
		}

	}

	public void Exit() {
		System.exit(0);
	}

}
