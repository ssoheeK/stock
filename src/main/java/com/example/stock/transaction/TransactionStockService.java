package com.example.stock.transaction;

import com.example.stock.service.StockService;

public class TransactionStockService {

    private final StockService stockService;

    public TransactionStockService(StockService stockService) {
        this.stockService = stockService;
    }

    /**
     * transaction annotation(@Transactional)이 추가되면
     * 해당 class에 트랜잭션 기능이 적용된 프록시 객체가 생성
     * 프록시 객체는 트랜잭션 어노테이션이 포함된 메소드가 호출될 경우,
     * PlatformTransactionManager를 사용하여 트랜잭션을 시작하고,
     * 정상 여부에 따라 Commit 또는 Rollback 한다.
     */
    public void decrease(Long id, Long quantity) {
        startTransaction();

        stockService.decrease(id, quantity);

        endTransaction();
    }

    private void startTransaction() {

    }

    private void endTransaction() {

    }
}
