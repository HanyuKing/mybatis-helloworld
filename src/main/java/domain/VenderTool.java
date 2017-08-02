package domain;

/**
 * @author wanghanyu
 * @create 2017-08-02 21:51
 */
public class VenderTool {
    private Long id;

    private Long venderId;

    private Long toolId;

    private Long seq;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public Long getToolId() {
        return toolId;
    }

    public void setToolId(Long toolId) {
        this.toolId = toolId;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "VenderTool{" +
                "id=" + id +
                ", venderId=" + venderId +
                ", toolId=" + toolId +
                ", seq=" + seq +
                '}';
    }
}
