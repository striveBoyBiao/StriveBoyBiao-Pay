package cn.exrick.dao;

import cn.exrick.bean.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author Exrickx
 */
public interface PayDao extends JpaRepository<Pay,String>, JpaSpecificationExecutor<Pay> {

    List<Pay> getByStateIs(Integer state);

    List<Pay> getByStateIsNotAndStateIsNot(Integer state1,Integer state2);
}
