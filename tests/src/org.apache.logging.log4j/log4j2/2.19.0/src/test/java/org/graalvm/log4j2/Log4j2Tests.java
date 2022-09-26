/*
 * Copyright and related rights waived via CC0
 *
 * You should have received a copy of the CC0 legalcode along with this
 * work. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package org.graalvm.log4j2;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

public class Log4j2Tests {

  @Test
  void logging() {
    LogManager.getLogger(Log4j2Tests.class).info("test");
  }

}

