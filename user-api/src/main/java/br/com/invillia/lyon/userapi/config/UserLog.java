package br.com.invillia.lyon.userapi.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

@Slf4j
public class UserLog extends JobExecutionListenerSupport{

    @Override
    public void afterJob(final JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            final long start = jobExecution.getStartTime().getTime();
            final long end = jobExecution.getEndTime().getTime();
            final long duration = end - start;

            //log.info("M=afterJob, I=sync-packing-list-job executado com sucesso, duration={}", duration);
        }
    }
}
