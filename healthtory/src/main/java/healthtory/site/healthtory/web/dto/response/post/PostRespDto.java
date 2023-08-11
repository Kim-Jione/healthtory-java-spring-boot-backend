package healthtory.site.healthtory.web.dto.response.post;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class PostRespDto {
	private Integer postId;
	private Integer userId;
    private String postTitle;
    private String postContent;
    private String postThumbnail;
    private Integer categoryId;
    private String status;
    private List<String> tagList;
}
