package untitled.domain;

import untitled.domain.FileUploaded;
import untitled.DriverApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="File_table")
@Data

public class File  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private Long size;
    
    
    
    
    
    private Date createdTime;
    
    
    
    
    
    private String type;
    
    
    
    
    
    private String userid;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    }

    public static FileRepository repository(){
        FileRepository fileRepository = DriverApplication.applicationContext.getBean(FileRepository.class);
        return fileRepository;
    }






}
