package healthtory.site.healthtory.web.dto.request.post;

import java.util.List;

import healthtory.site.healthtory.domain.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UpdateReqDto {
	private Integer userId;
	private Integer postId;
    private String postTitle;
    private String postContent;
    private String postThumbnail;
    private Integer categoryId;
    private String status;
    private List<String> tagList;

    public Post toPost() {
        return Post.builder().postId(this.postId).userId(this.userId).postTitle(this.postTitle).postContent(this.postContent).postThumbnail(this.postThumbnail).categoryId(this.categoryId).status(this.status).build();
    }
}
