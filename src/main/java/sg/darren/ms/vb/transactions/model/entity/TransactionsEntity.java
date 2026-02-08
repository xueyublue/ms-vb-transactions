package sg.darren.ms.vb.transactions.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_transactions")
public class TransactionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
