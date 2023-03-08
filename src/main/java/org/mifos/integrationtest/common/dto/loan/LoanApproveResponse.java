package org.mifos.integrationtest.common.dto.loan;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoanApproveResponse {
    public int officeId;
    public int clientId;
    public int loanId;
    public int resourceId;
    public ChangesResponse changes;
}

