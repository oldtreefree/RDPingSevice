package com.rd.rep;

import com.rd.models.IpServerList;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<IpServerList, Long> {
}
