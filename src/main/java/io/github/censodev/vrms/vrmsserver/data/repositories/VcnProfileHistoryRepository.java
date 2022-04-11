package io.github.censodev.vrms.vrmsserver.data.repositories;

import io.github.censodev.vrms.vrmsserver.data.domains.VcnProfileHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VcnProfileHistoryRepository extends JpaRepository<VcnProfileHistory, Long> {
}