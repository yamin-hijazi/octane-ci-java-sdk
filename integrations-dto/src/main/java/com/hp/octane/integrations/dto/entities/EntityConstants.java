package com.hp.octane.integrations.dto.entities;

public class EntityConstants {

    public static class Base {
        public static final String ID_FIELD = "id";
        public static final String NAME_FIELD = "name";
        public static final String LOGICAL_NAME_FIELD = "logical_name";
        public static final String DESCRIPTION_FIELD = "description";
        public static final String TYPE_FIELD_NAME = "type";
    }

    public static class AutomatedTest extends Base {
        public static final String COLLECTION_NAME = "automated_tests";
        public static final String ENTITY_NAME = "automated_test";

        public static final String TEST_RUNNER_FIELD = "test_runner";
        public static final String SCM_REPOSITORY_FIELD = "scm_repository";
        public static final String TESTING_TOOL_TYPE_FIELD = "testing_tool_type";
        public static final String TEST_TYPE_FIELD = "test_type";
        public static final String FRAMEWORK_FIELD = "framework";
        public static final String PACKAGE_FIELD = "package";
        public static final String EXECUTABLE_FIELD = "executable";
    }

    public static class ScmResourceFile extends Base {
        public static final String COLLECTION_NAME = "scm_resource_files";
        public static final String ENTITY_NAME = "scm_resource_file";

        public static final String RELATIVE_PATH_FIELD = "relative_path";
        public static final String SCM_REPOSITORY_FIELD = "scm_repository";
    }

    public static class ScmRepository extends Base {
        public static final String ENTITY_NAME = "scm_repository";
    }

    public static class TestRunner extends Base {
        public static final String ENTITY_NAME = "test_runner";
    }

    public static class Executors extends Base {
        public static final String COLLECTION_NAME = "executors";
    }

}
