/**
 * Copyright 2019 Mahabir Singh. All rights reserved.
 */

package singh.mahabir.bis.exception;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class is the default response of the application when application thrown
 * any exception
 * 
 * @author Mahabir Singh
 *
 */
@XmlRootElement
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {

    private java.time.LocalDateTime timestamp;
    private int status;
    private HttpStatus error;
    private String message;
    private String trace;
    private String path;
}
