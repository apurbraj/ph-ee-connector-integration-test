package org.mifos.integrationtest.common.dto.loan;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StatusResponse {
    public int id;
    public String code;
    public String value;
    public boolean pendingApproval;
    public boolean waitingForDisbursal;
    public boolean active;
    public boolean closedObligationsMet;
    public boolean closedWrittenOff;
    public boolean closedRescheduled;
    public boolean closed;
    public boolean overpaid;
}
