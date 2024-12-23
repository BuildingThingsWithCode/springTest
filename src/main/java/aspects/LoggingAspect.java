package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@Around("@annotation(ToLog)")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		logger.info("Method " + methodName + " with arguments "+ args[0].getClass() + " will execute");
		Object returnedByJoinPoint = joinPoint.proceed();
		logger.info("Method executed and returned " + returnedByJoinPoint);
		return returnedByJoinPoint;
	}
}
