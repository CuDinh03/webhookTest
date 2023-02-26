package repository;

import java.util.List;

import dto.WebHook;
import org.springframework.data.repository.CrudRepository;
public interface WebhookRepository  extends CrudRepository<WebHook, Long>{
     List<WebHook> findByCompanyNameAndType(String companyName, String type);
     List<WebHook> findByCompanyName(String companyName);
}
