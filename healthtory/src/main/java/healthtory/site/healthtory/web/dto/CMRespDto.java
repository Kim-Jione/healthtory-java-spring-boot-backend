package healthtory.site.healthtory.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CMRespDto<T> { // 공통 응답 DTO
	private Integer code; // 1정상, -1실패
	private String msg; // 실패한 이유, 성공한 이유
	private T data; // 응답할 데이터
}
