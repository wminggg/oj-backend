package com.oj.backend.esdao;

import com.oj.backend.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Description: 帖子 ES 操作
 * @Author: MING
 * @Date: 2024/03/05
 */

public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}