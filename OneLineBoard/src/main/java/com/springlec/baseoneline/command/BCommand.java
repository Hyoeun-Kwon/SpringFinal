package com.springlec.baseoneline.command;

import org.springframework.ui.Model;

public interface BCommand {
	//불러온 Data를 Model에 담아야 하기 때문에 공통적으로 쓰는 메소드 미리 지정
	void execute(Model model);
}
