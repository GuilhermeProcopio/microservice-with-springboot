package br.com.cthulhufood.pagamentos.repository;

import br.com.cthulhufood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
