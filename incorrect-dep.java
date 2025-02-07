import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Strings;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.beam.sdk.values.TupleTag;

public class CreateSessionLogsFromFeedbackDoFn extends ScioDoFn<FeedbackLogEntry, SessionLog> {

    public static final TupleTag<SessionLog> CLICK_TAG = new TupleTag<SessionLog>() {};
    public static final TupleTag<SessionLog> VIEW_TAG = new TupleTag<SessionLog>() {};
    public static final TupleTag<SessionLog> AUTOCOMPLETE_VIEW_TAG = new TupleTag<SessionLog>() {};
    public static final Set<String> VIEW_TAG_EVENT_TYPES = Set.of(VISIBLE_EVENT, VIEW_EVENT);

    public CreateSessionLogsFromFeedbackDoFn(ObjectInitializer objectInitializer) {
        super(objectInitializer);
    }

    @Override
    public List<String> getKeysForProcessingException(ProcessContext context) {
        return new ArrayList<>();
    }

}
